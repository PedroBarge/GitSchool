import java.util.*;

public class Main {
    //------------------------------------------------------------------//
    //Scanners
    static Scanner opcScn = new Scanner(System.in);
    static Scanner txtScn = new Scanner(System.in);
    //------------------------------------------------------------------//
    //Variaveis
    static int maxTask = 10;
    static int opcInput;
    static int taskCount = 0;
    static int taskCountConc = 0;
    static int indexArray;
    //------------------------------------------------------------------//
    //Arrays
    static String[] arrayToDo = new String[maxTask];
    static String textFromUser;

    //------------------------------------------------------------------//
    public static void main(String[] args) {
        //------------------------------------------------------------------//
        do {
            System.out.println("\nTo Do List");
            System.out.println();
            showMenu();
            opcInput = opcScn.nextInt();
            //------------------------------------------------------------------//
            switch (opcInput) {
                case 0:
                    showList();
                    break;
                //------------------------------------------------------------------//
                case 1:
                    addTask();
                    break;
                //------------------------------------------------------------------//
                case 2:
                    editTask();
                    break;
                //------------------------------------------------------------------//
                case 3:
                    doneTask();
                    break;
                //------------------------------------------------------------------//
                case 4:
                    undoneTask();
                    break;
                //------------------------------------------------------------------//
                case 5:

                    break;
                case 6:

                    break;
                default:
                    if (opcInput == 10) {
                        System.out.println("A sair da To Do List...");
                    } else System.out.println("Error");

                    break;
            }
        } while (opcInput != 10);
    }

    public static void showMenu() {
        System.out.println("Menu: ");
        System.out.println("----------");
        System.out.println("0- Ver Lista de tarefas");
        System.out.println("1- Adicionar tarefas");
        System.out.println("2- Editar tarefa");
        System.out.println("3- Marcar como concliudo");
        System.out.println("4- Desmarcar como concliudo");
        System.out.println("5- Elimnar tarefa");
        System.out.println("6- Organizar de A-Z tarefas");
        System.out.println("10- Fechar aplicação");
        System.out.println("----------");
        System.out.print("Inserir opção: ");
    }

    public static void showList() {
        System.out.println("Lista de tarefas: ");
        //Para ver as Task que ja fora add
        for (int i = 0; i < arrayToDo.length; i++) {
            if (arrayToDo[i] != null) {
                System.out.println(i + "-" + arrayToDo[i]);
            }
        }
    }

    public static void addTask() {
        System.out.println("Adicionar tarefa ");
        System.out.println("Por favor inserir uma tarefa");
        System.out.print("->");
        if (taskCount < maxTask) {
            textFromUser = txtScn.nextLine();
            arrayToDo[taskCount] = textFromUser;
            System.out.println("Adcionado com sucesso: " + arrayToDo[taskCount]);
            taskCount++;
        } else {
            System.out.println("Error");
        }
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        showList();
    }

    public static void editTask() {
        System.out.println("Editar Tarefa ");
        System.out.println("Qual tarefa quer editar?");
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        showList();
        //------------------------------------------------------------------//
        System.out.print("Secionar o numero associado: ");
        textFromUser = txtScn.nextLine();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        if (arrayToDo[indexArray] != null) {
            System.out.println("Novo texto: ");
            textFromUser = txtScn.nextLine();
            arrayToDo[indexArray] = textFromUser;
            //------------------------------------------------------------------//
            //Para ver as Task que ja fora add
            showList();
        } else {
            System.out.println("Error");
        }
    }

    public static void doneTask() {
        System.out.println("Marcar como concluido ");
        System.out.println("Qual tarefa quer marcar como concluido?");
        //------------------------------------------------------------------//
        showList();
        //------------------------------------------------------------------//
        System.out.print("->");
        textFromUser = txtScn.nextLine();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        if (arrayToDo[indexArray] != null) {
            System.out.println("Tarefa " + arrayToDo[indexArray] + " foi marcada como concuilda");
            arrayToDo[indexArray] += " ✅";
            taskCountConc++;
            //------------------------------------------------------------------//
            //Para ver as Task que ja fora add
            System.out.println("Task totais");
            showList();
            //------------------------------------------------------------------//

        } else {
            System.out.println("Error");
        }
    }

    public static void undoneTask() {
        int counter = 0;
        System.out.println("Desmarcar como concluido ");
        System.out.println("Qual tarefa quer desmarcar como concluido?");
        //------------------------------------------------------------------//
        showList();
        //------------------------------------------------------------------//
        System.out.print("->");
        textFromUser = txtScn.nextLine();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//

        if (arrayToDo[indexArray] == textFromUser) {
            if (arrayToDo[indexArray].contains(" ✅")){
                arrayToDo[indexArray] = arrayToDo[indexArray].replace(" ✅" , "");
            }

            System.out.println("Tarefa " + arrayToDo[indexArray] + " foi desmarcada como concuilda");
            //------------------------------------------------------------------//
            //Para ver as Task que ja fora add
            System.out.println("Task totais");
            showList();
            //------------------------------------------------------------------//
        } else {
            System.out.println("Error");
        }
    }

}