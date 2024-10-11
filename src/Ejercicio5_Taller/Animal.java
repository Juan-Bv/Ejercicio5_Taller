package Ejercicio5_Taller;


// Cree una clase abstracta Animal que define atributos y métodos para diferentes tipos de animales
abstract class Animal {
    /*
       Profesor, declaré las variables como 'protected' para que las subclases puedan acceder
       directamente a los atributos del animal. Estas variables representan características comunes
       a todos los animales, como su sonido, tipo de alimentación, hábitat y nombre científico.
    */
    protected String sonido; // Creé esta variable para almacenar el sonido característico del animal
    protected String alimentacion; // Creé esta variable para almacenar el tipo de alimentación del animal
    protected String habitat; // Creé esta variable para almacenar el hábitat natural del animal
    protected String nombreCientifico; // Creé esta variable para almacenar el nombre científico del animal

    // Cree un constructor que inicializa los atributos comunes de los animales
    public Animal(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        this.sonido = sonido; // Asigné el sonido del animal
        this.alimentacion = alimentacion; // Asigné el tipo de alimentación del animal
        this.habitat = habitat; // Asigné el hábitat del animal
        this.nombreCientifico = nombreCientifico; // Asigné el nombre científico del animal
    }

    // Cree un método abstracto que deberá implementarse en cada subclase
    public abstract void mostrarDatos(); // Declaro este método abstracto para que cada subclase defina cómo mostrar sus datos
}

// Profesor, cree una clase Canido que hereda de Animal y representa animales del grupo de los cánidos
class Canido extends Animal {
    // Constructor que llama al constructor de la clase Animal para inicializar sus atributos
    public Canido(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico); // Utilicé super para inicializar los atributos heredados
    }

    // Método que muestra los datos específicos de los cánidos
    @Override
    public void mostrarDatos() {
        /*
           Profesor, en este método imprimí el nombre científico del cánido, seguido del sonido
           que emite, el tipo de alimentación y su hábitat natural. Esto permite describir
           completamente las características del animal.
        */
        System.out.println(nombreCientifico); // Imprimí el nombre científico
        System.out.println("Sonido: " + sonido); // Imprimí el sonido
        System.out.println("Alimentos: " + alimentacion); // Imprimí el tipo de alimentación
        System.out.println("Hábitat: " + habitat); // Imprimí el hábitat natural
        System.out.println(); // Separador entre animales
    }
}

// Cree una clase Felino que hereda de Animal y representa animales del grupo de los felinos
class Felino extends Animal {
    // Constructor que llama al constructor de la clase Animal para inicializar sus atributos
    public Felino(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico); // Utilicé super para inicializar los atributos heredados
    }

    // Método que muestra los datos específicos de los felinos
    @Override
    public void mostrarDatos() {
        /*
           Profesor, en este método imprimí el nombre científico del felino, seguido del sonido,
           alimentación y hábitat. Esto permite mostrar toda la información necesaria para describir
           a los felinos en el programa.
        */
        System.out.println(nombreCientifico); // Imprimí el nombre científico
        System.out.println("Sonido: " + sonido); // Imprimí el sonido
        System.out.println("Alimentos: " + alimentacion); // Imprimí el tipo de alimentación
        System.out.println("Hábitat: " + habitat); // Imprimí el hábitat natural
        System.out.println(); // Separador entre animales
    }
}

// Cree una clase Perro que hereda de Canido y representa las características específicas del perro
class Perro extends Canido {
    // Constructor que asigna valores específicos para el perro
    public Perro() {
        /*
           Profesor, en este constructor llamé a la clase padre Canido utilizando valores específicos
           para representar un perro, como su sonido "Ladrido", su tipo de alimentación "Carnívoro",
           su hábitat "Doméstico" y su nombre científico.
        */
        super("Ladrido", "Carnívoro", "Doméstico", "Canis lupus familiaris");
    }
}

// Cree una clase Lobo que hereda de Canido y representa las características específicas del lobo
class Lobo extends Canido {
    // Constructor que asigna valores específicos para el lobo
    public Lobo() {
        /*
           Profesor, en este constructor llamé a la clase padre Canido utilizando valores específicos
           para representar un lobo, como su sonido "Aullido", su tipo de alimentación "Carnívoro",
           su hábitat "Bosque" y su nombre científico.
        */
        super("Aullido", "Carnívoro", "Bosque", "Canis lupus");
    }
}

// Cree una clase Leon que hereda de Felino y representa las características específicas del león
class Leon extends Felino {
    // Constructor que asigna valores específicos para el león
    public Leon() {
        /*
           Profesor, en este constructor llamé a la clase padre Felino utilizando valores específicos
           para representar un león, como su sonido "Rugido", su tipo de alimentación "Carnívoro",
           su hábitat "Pradera" y su nombre científico.
        */
        super("Rugido", "Carnívoro", "Pradera", "Panthera leo");
    }
}

// Cree una clase Gato que hereda de Felino y representa las características específicas del gato
class Gato extends Felino {
    // Constructor que asigna valores específicos para el gato
    public Gato() {
        /*
           Profesor, en este constructor llamé a la clase padre Felino utilizando valores específicos
           para representar un gato, como su sonido "Maullido", su tipo de alimentación "Ratones",
           su hábitat "Doméstico" y su nombre científico.
        */
        super("Maullido", "Ratones", "Doméstico", "Felis silvestris catus");
    }
}

   