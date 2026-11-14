int contador = 0;
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].getEdad() >= 15) {
                contador = contador + 1;
            }
        }
        System.out.println("Estudiantes de 15 años o más: " + contador);