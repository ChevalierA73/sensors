package de.ritter.deconz.api;

public class Senors {


    //The name of the sensor
    private String name;

    //	The model identifier of the sensor. required
    private String modelid;

    // The software version of the sensor. required
    private String swversion;

    // The type of the sensor (see: allowed sensor types and its states). required
    private SensorType type;

    // The unique id of the sensor. Should be the MAC address of the device. required
    private String uniqueid;

    // The manufacturer name of the sensor. required
    private  String manufacturername;

    // The state of the sensor (see: supported sensor types and its states). optional
    private State state;

    // The state of the sensor (see: supported sensor types and its states).
    //    config	Object	The config of the sensor.
    //            on - Bool - default: true
    private Config config;
}
