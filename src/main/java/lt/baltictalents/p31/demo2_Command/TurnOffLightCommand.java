package lt.baltictalents.p31.demo2_Command;

public class TurnOffLightCommand implements Command{

    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}
