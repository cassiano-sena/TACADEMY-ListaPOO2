//12 - Crie uma classe Elevador para armazenar as informações de um elevador de
//prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio
//(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes
//nele. A classe deve também disponibilizar os seguintes métodos:
//Inicializar: que deve receber como parâmetros a capacidade do elevador e o
//total de andares no prédio (os elevadores sempre começam no térreo e vazio);
//Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se
//ainda houver espaço);
//Sair: para remover uma pessoa do elevador (só deve remover se houver
//alguém dentro dele);
//Subir: para subir um andar (não deve subir se já estiver no último andar);
//Descer: para descer um andar (não deve descer se já estiver no térreo);
public class Elevator {
    private int currentFloor;
    private int totalFloors;
    private int capacity;
    private int currentPeople;
    public Elevator(int capacity, int totalFloors) {
        this.currentFloor = 0;
        this.capacity = capacity;
        this.totalFloors = totalFloors;
        this.currentPeople = 0;
    }
    public void enter() {
        if (currentPeople < capacity) {
            currentPeople++;
            System.out.println("One person entered the elevator. Current occupancy: " + currentPeople);
        } else {
            System.out.println("Elevator is full. Cannot add more people.");
        }
    }
    public void exit() {
        if (currentPeople > 0) {
            currentPeople--;
            System.out.println("One person exited the elevator. Current occupancy: " + currentPeople);
        } else {
            System.out.println("No one inside the elevator to exit.");
        }
    }
    public void up() {
        if (currentFloor < totalFloors) {
            currentFloor++;
            System.out.println("Elevator moved up to floor " + currentFloor);
        } else {
            System.out.println("Already at the top floor. Cannot go up further.");
        }
    }
    public void down() {
        if (currentFloor > 0) {
            currentFloor--;
            System.out.println("Elevator moved down to floor " + currentFloor);
        } else {
            System.out.println("Already at the ground floor. Cannot go down further.");
        }
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getCurrentPeople() {
        return currentPeople;
    }
}
