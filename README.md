# Virtual-Pet-Simulator
A beginner-level Java console-based Virtual Pet Simulator using OOPS concepts like abstraction and inheritance. Interact with your own pet (Dog or Cat) by feeding, playing, and letting them sleep — while monitoring their happiness, energy, and hunger levels.

# 🐾 Virtual Pet Simulator (Java OOP Project)

Welcome to the **Virtual Pet Simulator**, a beginner-friendly console-based application built using Java's Object-Oriented Programming concepts! This fun little game allows you to adopt and care for your virtual pet — choose between a **Dog** or a **Cat**, name it, and keep it happy by feeding, playing, and letting it rest!

---

## ✨ Features

- 🐶 Choose between Dog or Cat
- 🧡 Feed, Play, and Put your pet to sleep
- 📈 Tracks **hunger**, **happiness**, and **energy** levels
- 👨‍💻 Implements core OOP principles:
  - Abstract class (`VirtualPet`)
  - Inheritance (`Dog`, `Cat`)
  - Polymorphism (different behaviors for sleep)
- 🔁 Continuous interaction loop until you exit

---

## 💡 How It Works

1. **User chooses pet type** (Dog or Cat).
2. **User enters pet name**.
3. A loop begins, letting the user:
   - Feed the pet
   - Play with the pet
   - Put the pet to sleep
   - Exit the simulation
4. After each action, the pet's status (happiness, hunger, energy) is shown.

---

## 🛠️ Built With

- Java (no external libraries required)
- OOPS concepts like:
  - Abstraction
  - Inheritance
  - Method Overriding
- Console-based interaction using `Scanner`

---

## 🚀 Getting Started

1. **Clone this repository**
   ```bash
   git clone https://github.com/your-username/Virtual-Pet-Simulator.git
   cd Virtual-Pet-Simulator
2. **Compile & Run**
    javac *.java
    java Main

📂 **File Structure**

Virtual-Pet-Simulator/
├── VirtualPet.java     # Abstract class
├── Dog.java            # Dog class (extends VirtualPet)
├── Cat.java            # Cat class (extends VirtualPet)
└── Main.java           # Entry point of the application

🎯 **Future Improvements**

  - Add more pet types (e.g., Rabbit, Parrot)
  - Add sounds or ASCII visuals for pets
  - Save pet progress using file I/O
  - Add GUI using JavaFX or Swing
