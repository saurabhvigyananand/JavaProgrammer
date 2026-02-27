package JavaSE8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Task {
    int id;
    String name;
    int daysLeft;

    public Task(int id, String name, int daysLeft) {
        this.id = id;
        this.name = name;
        this.daysLeft = daysLeft;
    }

    // Getters
    public int getDaysLeft() { return daysLeft; }
    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "Task{id=" + id + ", name='" + name + "', daysLeft=" + daysLeft + "}";
    }
}

public class SortByOneFieldThenOther {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task(1, "Fix Bug", 5),
                new Task(2, "Refactor", 2),
                new Task(3, "Documentation", 2),
                new Task(4, "Testing", 1)
        );

        // Sorting Logic: DaysLeft (Ascending) then Name (Alphabetical)
        List<Task> sortedTasks = tasks.stream()
                .sorted(Comparator.comparing(Task::getDaysLeft)
                        .thenComparing(Task::getName))
                .toList();

        sortedTasks.forEach(System.out::println);
    }
}