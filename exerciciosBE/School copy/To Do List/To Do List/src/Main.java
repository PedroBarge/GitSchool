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
    static int taskCountDel = 0;
    static int indexArray;
    //------------------------------------------------------------------//
    //Arrays
    static String[] arrayToDo = new String[maxTask];
    static String[] arrayDeletd = new String[maxTask];
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
                    deleteTask();
                    break;
                case 6:
                    sortTask();
                    break;
                default:
                    if (opcInput == 10) {
                        System.out.println("A sair da To Do List...");
                    } else System.out.println("Opção inválida");

                    break;
            }
        } while (opcInput != 10);
    }

    //------------------------------------------------------------------//
    public static void showMenu() {
        System.out.println("Menu: ");
        System.out.println("----------");
        System.out.println(" 0- Ver Lista de tarefas");
        System.out.println(" 1- Adicionar tarefas");
        System.out.println(" 2- Editar tarefa");
        System.out.println(" 3- Marcar como concliudo");
        System.out.println(" 4- Desmarcar como concliudo");
        System.out.println(" 5- Eliminar tarefa");
        System.out.println(" 6- Organizar de A-Z tarefas");
        System.out.println("10- Fechar aplicação");
        System.out.println("----------");
        System.out.print("Inserir opção: ");
    }

    //------------------------------------------------------------------//
    public static void showList() {
        //Para ver as Task que ja fora add
        System.out.println("Lista de tarefas: ");
        for (int i = 0; i < taskCount; i++) {
            if (arrayToDo[i] != null) {
                System.out.println(i + "- " + arrayToDo[i]);
            }

        }
        //------------------------------------------------------------------//
        /*for (int i = 0; i < arrayToDo.length; i++) {
            if (arrayToDo[i] != null) {
                System.out.println(i + "-" + arrayToDo[i]);
            }
        }*/
    }

    //------------------------------------------------------------------//
    public static void addTask() {
        if (taskCount < maxTask) {
            System.out.println("Adicionar tarefa ");
            System.out.println("Por favor inserir uma tarefa");
            System.out.print("->");
            textFromUser = txtScn.nextLine();
            textFromUser = textFromUser.toLowerCase();
            arrayToDo[taskCount] = textFromUser;
            System.out.println("Adcionado com sucesso: " + arrayToDo[taskCount]);
            taskCount++;
        } else {
            System.out.println("Limite de tarefas atingido");
        }
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        showList();
    }

    //------------------------------------------------------------------//
    public static void editTask() {
        System.out.println("Editar Tarefa ");
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        showList();
        //------------------------------------------------------------------//
        System.out.println("Qual tarefa quer editar?");
        System.out.print("Secionar o numero associado: ");
        textFromUser = txtScn.nextLine();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        if (indexArray >= 0 && indexArray < taskCount) {
            System.out.print("Inserir texto: ");
            textFromUser = txtScn.nextLine();
            arrayToDo[indexArray] = textFromUser;
            showList();
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    //------------------------------------------------------------------//
    public static void doneTask() {
        System.out.println("Marcar como concluido ");
        //------------------------------------------------------------------//
        showList();
        //------------------------------------------------------------------//
        System.out.println("Qual tarefa quer marcar como concluido?");
        System.out.print("->");
        textFromUser = txtScn.nextLine();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        if (indexArray >= 0 && indexArray < taskCount) {
            System.out.println("Tarefa " + arrayToDo[indexArray] + " foi marcada como concluída");
            arrayToDo[indexArray] += " ✅";
            taskCountConc++;
            showList();
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    //------------------------------------------------------------------//
    public static void undoneTask() {
        int counter = 0;
        System.out.println("Desmarcar como concluido ");
        //------------------------------------------------------------------//
        showList();
        //------------------------------------------------------------------//
        System.out.println("Qual tarefa quer desmarcar como concluido?");
        System.out.print("->");
        textFromUser = txtScn.next();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        if (indexArray >= 0 && indexArray < taskCount) {
            if (arrayToDo[indexArray].contains(" ✅")) {
                arrayToDo[indexArray] = arrayToDo[indexArray].replace(" ✅", "");
                System.out.println("Tarefa " + arrayToDo[indexArray] + " foi desmarcada como concluída.");
            } else {
                System.out.println("Esta tarefa não está marcada como concluída.");
            }
            showList();
        } else {
            System.out.println("Número de tarefa inválido.");
        }
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        System.out.println("Task totais");
        showList();
        //------------------------------------------------------------------//
    }

    //------------------------------------------------------------------//
    public static void deleteTask() {
        // ir ver nos exercios da Maria como se eliminar

        System.out.println("Eliminar tarefa ");
        showList();
        System.out.println("Por favor inserir apenas um numero da tarefa a ser eliminada");
        System.out.print("->");
        textFromUser = txtScn.next();
        indexArray = Integer.parseInt(textFromUser);
        //------------------------------------------------------------------//
        //String[] newArrayTemp = new String[arrayToDo.length - 1];

        if (indexArray >= 0 && indexArray < taskCount) {
            for (int i = indexArray; i < taskCount - 1; i++) {
                arrayToDo[i] = arrayToDo[i + 1];
            }
            arrayToDo[taskCount - 1] = null;
            taskCount--;
            showList();
        } else {
            System.out.println("Número de tarefa inválido.");
        }
        //------------------------------------------------------------------//
        //Para ver as Task que ja fora add
        showList();

    }

    public static void sortTask() {
        /*for (int i = 0; i < arrayToDo.length ; i++) {
            for (int j = i + 1; j < arrayToDo.length-1; j++) {
                if (arrayToDo[i] != null && arrayToDo[j] != null) {
                    String temp = arrayToDo[j];
                    arrayToDo[j] = arrayToDo[i];
                    arrayToDo[i] = temp;
                }
            }
        }*/
        Arrays.sort(arrayToDo, 0, taskCount);
        System.out.println("Lista organizada em ordem alfabética:");
        showList();

    }
}