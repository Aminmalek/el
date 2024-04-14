package org.example;
import java.util.LinkedList;
import java.util.Queue;


public class Elevator {
    //removeFloorFromQueue(Floor floor): Removes a floor from the destination queue.
//openDoors(): Opens the doors of the elevator.
//closeDoors(): Closes the doors of the elevator.
//isMoving(): Returns a boolean indicating whether the elevator is currently in motion.
//getCurrentFloor(): Returns the current floor of the elevator.
//getDirection(): Returns the direction in which the elevator is moving.
//getDestinationQueue(): Returns the list of destination floors in the queue.


    private Floor currentFloor;
    private Direction direction;
    private Queue<Floor> destinationQueue;

    public Queue<Floor> addFloorToQueue(Floor floor){
         Queue<Floor> queue = new LinkedList<>();
         queue.add(floor);
         return queue;

    }
    public Queue<Floor> removeFloorFromQueue(Floor floor,Queue<Floor> queue){
        return queue;
    }
     public void moveToFloor(Floor floor){

    }


    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Queue<Floor> getDestinationQueue() {
        return destinationQueue;
    }

    public void setDestinationQueue(Queue<Floor> destinationQueue) {
        this.destinationQueue = destinationQueue;
    }
}
