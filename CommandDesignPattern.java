
interface Command {
    void execute();
}

class Light {
    void on() { System.out.println("Light ON"); }
    void off() { System.out.println("Light OFF"); }
}

class LightOnCommand implements Command {
    Light light;
    LightOnCommand(Light light) { this.light = light; }
    public void execute() { light.on(); }
}

class LightOffCommand implements Command {
    Light light;
    LightOffCommand(Light light) { this.light = light; }
    public void execute() { light.off(); }
}

class Remote {
    Command command;
    void setCommand(Command c) { command = c; }
    void pressButton() { command.execute(); }
}

public class CommandDesignPattern {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();   // Light ON

        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();   // Light OFF
    }
}
