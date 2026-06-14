package Assignment.basic;
import java.util.*;
/*
  Scenario
 You are managing a high-frequency trading engine that processes
  time-bounded tasks on limited CPU cores.
Each task is represented as:
task_id, start_time, end_time, priority
📌 Rules
A CPU core can process only one task at a time
Tasks cannot overlap on the same core

If two tasks overlap in time:

The task with higher priority must be executed

The lower-priority task is dropped

If priorities are equal:

The task with earlier end_time is preferred

Goal:

Maximize total executed tasks

Return list of executed task IDs

🔢 Input Constraints
1 ≤ N ≤ 10^5
0 ≤ start_time < end_time ≤ 10^9
1 ≤ priority ≤ 10^6

📥 Input Example
tasks = [
  (1, 1, 5, 2),
  (2, 2, 6, 3),
  (3, 4, 7, 1),
  (4, 6, 8, 2),
  (5, 7, 9, 4)
]

output -3
**/
class MainTest{
    static class Task {
        int id, start, end, priority;
        Task(int i, int s, int e , int p){
            id = i;
            start = s;
            end = e;
            priority = p;
        }
    }
    public static void main(String []args) {
        List<Task>  tasks = List.of(
                new Task (1, 1, 5, 2),
                new  Task(2, 2, 6, 3),
                new  Task(3, 4, 7, 1),
                new  Task(4, 6, 8, 2),
                new  Task (5, 7, 9, 4)
        );

        List<Task> selected =  new ArrayList<>();
        for(Task  curr: tasks){
            boolean replaced = true;

            List<Task> toRemove = new ArrayList<>();
            for(Task prev : selected){

                // Iterator<Task> it = selected.iterator();
                // while(it.hasNext()){

                //    Task prev = it.next();

                if(curr.start< prev.end && prev.start <curr.end){

                    if(prev.priority>= curr.priority || curr.priority == prev.priority && prev.end< curr.end){
                        // it.remove();
                        replaced = false;
                        break;
                    }
                    else{
                        toRemove.add(prev);

                    }


                }

            }
            selected.removeAll(toRemove);
            if(replaced){
                selected.add(curr);

            }
        }


        // for(Task t : selected){
        //   System.out.print(t.id+ "");
        // }

        System.out.println(selected.size());

        // code here
    }

}