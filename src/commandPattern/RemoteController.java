package src.commandPattern;

public class RemoteController {
    /*the remoteController is the invoker it only knows that it has a command object
    which implements the command interface which has a method execute.
     */

    Command slot;

    public void setCommand(Command obj){
        slot = obj;
    }

    public void onClick(){
        slot.execute();
    }
}
