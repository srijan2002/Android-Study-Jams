# Android-Study-Jams

Tic-Tac-Toe Gaming App

<b> Problem Statement: </b>

With the advent of the gaming generation  at hand, the Gen-Z children barely visit arcades when you have a mobile application for the same. Huge efforts are being made to enable mobile gaming without hampering the user experience. One of the main motive of the application is a step forward towards Native Game Development using Kotlin.

<b> Proposed Solution: </b>

Instead of drawing the 3 by 3 matrix every time you play, this application provides a light-weight Naughts and Crosses game, fed with the actual game logic. 

<img src="https://user-images.githubusercontent.com/77445478/148654534-b4558ed2-4d50-4476-b122-0ca0daa1fce0.jpg" width="250" height="500">
<img src="https://user-images.githubusercontent.com/77445478/148654572-b688cdcc-a0c7-429c-84a1-688c102f81a3.jpg" width="250" height="500">
<img src="https://user-images.githubusercontent.com/77445478/148654601-5bd5d363-9bfa-4ca1-8fc7-69228c1ff18c.jpg" width="250" height="500">

<b> Functionality & Concepts used : </b>

- The App has a very simple and interactive interface that allows the user to enter his/her name and play the game

- Constraint Layout : Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.

- Fragments : To holds part of the behavior and/or UI of an activity.

- ImageView : To add relevant images or icons

- Navigation Library : All of the screens are navigated through the nav_graph specified using the Navigation Controller.

- Room Database : Used in `/app/src/main/java/data` , we have used DAOs to store the data of a user:- No.of wins, No.of losses

- Classes, Objects and Constructors : Data handling

- LiveData & ViewModel - To store and manage UI-related data when navigating in between screens.


<b> Application Link & Future Scope : </b>

Currently, the application is under further development stage, with limited data handling. You can access the app:- https://github.com/srijan2002/Tic-Tac-Toe

We have planned to implement Sockets.io in this application, so as to allow real-time multiplayer scenarios in Naughts and Crosses. Moreover, it is planned to design a leaderboard for all the registered users, thus giving it an actual look of a gaming platform.
