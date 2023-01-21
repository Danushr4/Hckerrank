public class sam {
    public static void main(String[] args) {

#include <WiFi.h>
#include <MQTT.h>
#include "IPAddress.h"

#define LIGHT_SENSOR_PIN 36


const char ssid[] = "DELLLAP";
const char pass[] = "12345678";

        WiFiClient net;
        MQTTClient client;

        unsigned long lastMillis = 0;

        void connect() {
            Serial.print("checking wifi...");
            while (WiFi.status() != WL_CONNECTED) {
                Serial.print(".");
                delay(1000);
            }

            Serial.print("\nconnecting...");
            while (!client.connect("arduino", "public", "public")) {
                Serial.print(".");
                delay(1000);
            }

            Serial.println("\nconnected!");

            client.subscribe("/hello");
        }

        void messageReceived(String &topic, String &payload) {
            Serial.println("incoming: " + topic + " - " + payload);

        }

        void setup() {
            Serial.begin(115200);
            WiFi.begin(ssid, pass);


            client.begin(net);
            client.setHost(IPAddress(192, 168, 1, 50), 1883);
            client.onMessage(messageReceived);

            connect();
        }

        void loop() {
            client.loop();
            delay(10);

            if (!client.connected()) {
                connect();
            }
            int analogValue = analogRead(LIGHT_SENSOR_PIN);

            Serial.print("Analog Value = ");
            Serial.print(analogValue);


            client.publish("/hello", String(analogValue));

        }
    }
}
