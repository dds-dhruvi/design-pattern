package src.commandPattern;

public class RemoteController {
    /*the remoteController is the invoker it only knows that it has a command object
    which implements the command interface which has a method execute.
     */

    Command[]  onCommand;
    Command[] offCommand;

    public RemoteController(int n){
        onCommand = new Command[n];
        offCommand = new Command[n];

        for(int i = 0; i< n ; i++){
            onCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCom, Command offCom){
        onCommand[slot] = onCom;
        offCommand[slot] = offCom;
    }

    public void onClickOn(int slot){
        onCommand[slot].execute();

    }

    public void onClickOff(int slot){

        offCommand[slot].execute();
    }
}
