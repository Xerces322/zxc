package oop.class_object.clone;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Agent agent = new Agent("Мистер Смит");
        Agent[] clones = cloneAgents(4, agent);
        for (Agent clone : clones) {
            System.out.println(clone.toString());
        }
    }

    public static Agent[] cloneAgents(int quantity, Agent original) throws CloneNotSupportedException {
        Agent[] clones = new Agent[quantity];
        for (int i = 0; i < quantity; i++) {
            Agent clone = (Agent) original.clone();
            clones[i] = clone;
        }
        return clones;
    }
}
