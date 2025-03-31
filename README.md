# 🍕 Sistema de Gestió de Comandes de Pizzes (Builder Pattern)

Aquest projecte implementa un sistema de gestió de comandes de pizzes utilitzant el **Patró de Disseny Builder** en Java. L'objectiu és permetre la creació de diferents tipus de pizzes amb configuracions personalitzades com mida, tipus de massa i ingredients.

---

## 📌 Característiques

- Creació de pizzes amb configuracions personalitzades.
- Suport per a diferents tipus de pizzes (Hawaiana, Vegetariana, Margarita, etc.).
- Implementació del Patró de Disseny **Builder** per facilitar la construcció d'objectes complexos.
- Separació clara entre la construcció de pizzes i la seva representació final.
- Flexible i extensible per afegir nous tipus de pizzes fàcilment.

---

## 📁 Estructura del projecte

```
/src
│
├── Classes
│   ├── Pizza.java                # Classe que representa una pizza
│   ├── PizzaBuilder.java         # Interfície per definir el procés de creació d'una pizza
│   ├── HawaianaPizzaBuilder.java # Implementació concreta de PizzaBuilder per a pizza hawaiana
│   ├── VegetarianaPizzaBuilder.java # Implementació concreta de PizzaBuilder per a pizza vegetariana
│   ├── MestrePizzer.java         # Classe que dirigeix el procés de construcció de pizzes
│   └── Main.java                 # Punt d'entrada del programa
│
├── README.md                     # Documentació del projecte
```

---

## 📦 Instal·lació

1. Clona aquest repositori:
```bash
git clone https://github.com/teu-usuari/nombre-del-repositori.git
```

2. Importa el projecte al teu IDE preferit (Eclipse, IntelliJ, etc.).

3. Compila i executa el fitxer `Main.java`.

---

## 🔨 Ús

El sistema permet crear pizzes amb diferents configuracions. Per exemple:

```java
MestrePizzer mestre = new MestrePizzer(new HawaianaPizzaBuilder());
Pizza pizzaHawaiana = mestre.cuinarPizza();
System.out.println(pizzaHawaiana);

mestre = new MestrePizzer(new VegetarianaPizzaBuilder());
Pizza pizzaVegetariana = mestre.cuinarPizza();
System.out.println(pizzaVegetariana);
```

---

## 📚 Patró Builder

El patró **Builder** és útil quan un objecte té molts atributs opcionals o configurables. En aquest projecte, permetem que la pizza es construeixi pas a pas, oferint una interfície clara i fàcil d'entendre.

---

## 🚀 Millores futures

- Afegir més tipus de pizzes (Pepperoni, Margarita, Quatre Formatges, etc.).
- Permetre la selecció de massa i ingredients des del menú principal.
- Implementar un menú interactiu per a l'usuari.
- Afegir persistència de dades per guardar comandes.

---

## 📜 Llicència

Aquest projecte està sota la llicència MIT. Consulta el fitxer `LICENSE` per a més informació.

