package org.jetBrains.oop.javacore.practice;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;

public class StreamPractice {

    @Test
    public void streamPractice() {
        Arrays.asList(1, 2, 3, 6, 3, 7, 2, 4).stream().sorted().forEach(n -> System.out.println(n));
        System.out.println("=====");
        Arrays.asList(1, 2, 3, 6, 3, 7, 2, 4).stream().sorted().distinct().forEach(n -> System.out.println(n));
        System.out.println("=====");
        Arrays.asList(1, 2, 3, 6, 3, 7, 2, 4).stream().sorted(Comparator.reverseOrder()).distinct().forEach(n -> System.out.println(n));
        System.out.println("=====");
        Arrays.asList("Banana", "Kiwi").stream().sorted().map(str -> str.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("=====");
        Arrays.asList("Banana", "Kiwi").stream().sorted().filter(str -> str.equals("Kiwi")).forEach(s -> System.out.println(s));
    }
      /*
        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).collect(Collectors.toList());

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(pc -> pc.getProjectCode().equals(projectCode)).collect(Collectors.toList());

        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> fn.getFirstName().equals(firstName)).findFirst().get();

        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> !fn.getFirstName().equals(firstName)).collect(Collectors.toList());

        List<Project> listOfProjects = DataGenerator.getProjects();
        listOfProjects.stream().filter(st -> st.getProjectStatus().equals(oldStatus)).forEach(e -> e.setProjectStatus(newStatus));
        return listOfProjects;

        List<User> listOfUsers = DataGenerator.getUsers();
        return (long) listOfUsers.stream().filter(ml -> ml.getGender().equals(Gender.MALE)).count();


    }
     */
}
