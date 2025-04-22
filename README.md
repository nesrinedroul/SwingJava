# 🌡️ TemperatureAppMVC

Une application Java simple illustrant le **Modèle-Vue-Contrôleur (MVC)** avec le **patron Observateur**, permettant de manipuler et d'afficher la température en Celsius et Fahrenheit à l’aide de plusieurs vues synchronisées.

---

## 📚 Objectifs pédagogiques

- Appliquer le pattern **MVC** en Java
- Utiliser le pattern **Observer** pour synchroniser les vues avec le modèle
- Manipuler des composants Swing (`JLabel`, `JSlider`, etc.)
- Mettre à jour les interfaces graphiques dynamiquement selon les changements du modèle

---

## 🧠 Structure du projet

```
TemperatureAppMVC/
│
├── model/
│   └── DonneeTemp.java         # Le modèle : contient la température en Celsius, notifie les vues
│
├── view/
│   ├── ViewF.java              # Vue en Fahrenheit (affichage en JLabel)
│   ├── ViewSlide.java          # Vue avec un slider pour changer la température
│   └── ViewObser.java          # Interface Observer pour les vues
│
├── controller/
│   └── Controller.java         # Contrôleur agissant comme une stratégie pour connecter les vues et le modèle
│
├── Main.java                   # Classe principale pour lancer l'application
└── README.md                   # Ce fichier
```

---

## ⚙️ Fonctionnement

- **DonneeTemp** : modèle central qui contient la température en °C.
- **ViewSlide** : un `JSlider` permet de modifier la température.
- **ViewF** : affiche la température convertie en °F.
- Les vues s'enregistrent auprès du modèle avec `addView()` et sont notifiées automatiquement via `notifyViews()` dès que la température change.

---

## 🎮 Démo visuelle

- 👟 Lorsque l'utilisateur déplace le slider dans la vue `ViewSlide`, la température change dans le modèle.
- 🔄 Toutes les vues s’actualisent automatiquement grâce au **patron Observateur**.

---

## 🚀 Lancer le projet

1. Ouvre le projet dans **IntelliJ IDEA** ou un autre IDE Java.
2. Assure-toi d'avoir un **JDK 8 ou supérieur** installé.
3. Compile le projet.
4. Exécute `Main.java`.

---

## 📆 Exigences techniques

- Java 8+
- Aucun framework externe
- Swing (librairie native Java pour l’interface graphique)

---

## ✨ Capture d'écran (optionnel)

*(Tu peux insérer ici une capture d’écran de l’application avec le slider et l'affichage des températures si tu veux impressionner un professeur ou lecteur GitHub.)*

![image](https://github.com/user-attachments/assets/d6041c73-a195-43bd-b81a-855723d681ef)

## 📃 Licence

Ce projet est libre d'utilisation à des fins pédagogiques.
