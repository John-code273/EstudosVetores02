void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos quartos seram alugados, de 0 á 9 ");
    int n = scanner.nextInt();
    scanner.nextLine();
    Quartos[] quartos = new Quartos[10];

    for (int i = 0; i < n; i++) {
        System.out.println("Aluguel #" + (i + 1) + ":");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");
        quartos[numeroQuarto] = new Quartos(nome, email);
    }
    System.out.println("");
    System.out.println("Quartos alugados: ");
    for (int i = 0; i < 10; i++) {
        if (quartos[i] != null) {
            System.out.println(i + ": " + quartos[i].nome + ", " + quartos[i].email);

        }
    }
}