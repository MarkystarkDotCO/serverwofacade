/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author methanon
 */
public class FacadeSchedule {
    private static ScheduleServer server;
    public static void startServer(){
        server = new ScheduleServer();
	server.startBooting();
	server.readSystemConfigFile();
	server.init();
	server.initializeContext();
	server.initializeListeners();
	server.createSystemObjects();
	System.out.println("Start working......");

    }
    public static void stopServer(){
    System.out.println("After work done.........");
	server.releaseProcesses();
	server.destory();
	server.destroySystemObjects();
	server.destoryListeners();
	server.destoryContext();
	server.shutdown();
    }

}
