Assignment 1 IMAD ReadMe File 
 This Android app displays the menu of the day and allows users to interact with it. 
The app is built using Kotlin and utilizes Android studio. 
The code structure of the app consists of MainActivity handles users input and updates the UI. 
Layout/Activity_main.xml defines the UI layout for the main activity  
 
 
When the app launches MainActivity.kt it collects menu data from Menu Data.kt 
The menu is then passed to Menu adapter. Kt, which fills the Text display like I wrote in my application with menu items. So that when the user clicks on time of day (e.g. morning, mid-morning, afternoon, and dinner) MainActivity.kt handles the click event and updates the UI accordingly.  

 
Button Click Events 
 
Submit” Button: when it is clicked the button recreate an order by displaying a toast message with the selected menu items name. 
For the submit button if you enter a wrong time of the day, it will display a message that says ‘ Error: Please enter valid time of day (Morning, Mid-morning, afternoon, dinner) 
Reset” Button: when it is clicked this button resets the menu and display a message that says “Please enter menu” 
 
 

 

 
 

 
 



