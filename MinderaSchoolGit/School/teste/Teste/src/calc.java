while (!ciclos) {
        System.out.println("Ciclo invertido");
        System.out.print("Inserir numero: ");
        Scanner stringScanner = new Scanner(System.in);
        int x = stringScanner.nextInt();
        int number = x;
        for (int i = x; i >= 0; i--) {
        System.out.println(i);
        total = total + i;
        }