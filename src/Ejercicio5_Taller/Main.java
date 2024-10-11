package Ejercicio5_Taller;

public class Main {

    public static void main(String[] args) {
        // Creé un arreglo de objetos Animal para almacenar diferentes tipos de animales
        Animal[] animales = new Animal[4]; // Definí un arreglo con capacidad para 4 animales

        // Instancié cada tipo de animal en el arreglo según el orden deseado
        animales[0] = new Gato();  // Creé un objeto Gato y lo asigné a la primera posición
        animales[1] = new Perro();  // Creé un objeto Perro y lo asigné a la segunda posición
        animales[2] = new Lobo();   // Creé un objeto Lobo y lo asigné a la tercera posición
        animales[3] = new Leon();   // Creé un objeto Leon y lo asigné a la cuarta posición

        // Llamé al método mostrarDatos para imprimir la información de cada animal
        for (Animal animal : animales) {
            animal.mostrarDatos(); // Mostré los datos de cada animal en el arreglo
        }
    }
}
