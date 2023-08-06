package State;

// Интерфейс состояний светофора
interface TrafficLightState {
    void changeState(TrafficLight light);
}
// Конкретное состояние - Красный свет
class RedLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight light) {
        System.out.println("Переключаем светофор в Зеленый");
        light.setState(new GreenLightState());
    }
}
// Конкретное состояние - Зеленый свет
class GreenLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight light) {
        System.out.println("Переключаем светофор в Желтый");
        light.setState(new YellowLightState());
    }
}
// Конкретное состояние - Желтый свет
class YellowLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight light) {
        System.out.println("Переключаем светофор в Красный");
        light.setState(new RedLightState());
    }
}
// Класс светофора, который использует различные состояния
class TrafficLight {
    private TrafficLightState state;
    public TrafficLight() {
        this.state = new RedLightState();
    }
    public void setState(TrafficLightState state) {
        this.state = state;
    }
    public void changeState() {
        state.changeState(this);
    }
}
// Пример использования паттерна State
public class State {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.changeState(); // Зеленый свет
        trafficLight.changeState(); // Желтый свет
        trafficLight.changeState(); // Красный свет
    }
}
