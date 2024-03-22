package src.commandPattern;

public class CommandPattern {

    public static void main(String[] args){
         RemoteController controller = new RemoteController();
         Light light = new Light();
         Fan fan = new Fan();
         LightOnCommand lightOnCommand = new LightOnCommand(light);
         FanOnCommand fanOnCommand = new FanOnCommand(fan);
         controller.setCommand(lightOnCommand);
         controller.onClick();
         controller.setCommand(fanOnCommand);
         controller.onClick();

         /* 1. you need to create classes for all the objects that need to be controlled
         2. create a command interface which has a execute method
         3. create a command class (which implements the command interface --
         to handle each object and this class will have a instance of the class it handles (pass in constructor) and will define the execute method accordingly
         4. Create a controller class which will have properties of type command (slot1, slot2 ..)
         5. set the slots of the controller by calling the setCommand method
          */

    }
}
