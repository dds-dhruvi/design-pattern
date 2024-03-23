package src.commandPattern;

public class CommandPattern {

    public static void main(String[] args){
         RemoteController controller = new RemoteController(5);
         Light light = new Light();
         Fan fan = new Fan();
         LightOnCommand lightOnCommand = new LightOnCommand(light);
         LightOffCommand lightOffCommand = new LightOffCommand(light);
         FanOnCommand fanOnCommand = new FanOnCommand(fan);
         controller.setCommand(0,lightOnCommand,lightOffCommand );
         controller.onClickOn(0);
//         controller.setCommand(fanOnCommand);
         controller.onClickOff(0);
         controller.onClickOn(4);

         /* 1. you need to create classes for all the objects that need to be controlled
         2. create a command interface which has a execute method
         3. create a command class (which implements the command interface --
         to handle each object and this class will have a instance of the class it handles (pass in constructor) and will define the execute method accordingly
         4. Create a controller class which will have properties of type command (slot1, slot2 ..)
         5. set the slots of the controller by calling the setCommand method
          */



  /*       Using lambda expressions we can avoid creating concrete command objects
           we can use lambda expressions only if the command interface has exactly one abstract method

   */
         RemoteController controller1 = new RemoteController(3);
         Light light1 = new Light();
         controller1.setCommand(1, ()->light.on(), ()-> light.off());
         controller1.onClickOff(1);

         /*if a method has a parameter of type functional interface (has only one abstract method) then while
         calling the function we can pass a lambda expression (which is like the implementation of the abstract method)
         by doing this we can skip the step of having a concrete implementation of the functional interface !!!
          */
    }
}
