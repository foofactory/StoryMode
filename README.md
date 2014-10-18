sse-chat-java
=============

This is a simple chat application using **[Play Framework](http://www.playframework.com)** together with **[AngularJS](http://angularjs.org)**. It makes use of an EventSource to push the data from the server to the client. Together these building blocks facilitate the chat message data flow within the application.
The app has been originally written in Scala by [Matthias Nehlsen](https://github.com/matthiasn). This project is a rewrite of the app in Java. The app in Scala can be found [here](https://github.com/matthiasn/sse-chat).

![Architecture](./tutorial/sse-chat.png)

The application uses Server Sent Events for delivering messages to the client and REST calls for sending messages to the server. The messages flow from the POST to the **[Server Sent Events (SSE)](http://dev.w3.org/html5/eventsource/)** stream through Concurrent.broadcast as the central information hub into the chatFeed controller which attaches an Enumeratee / Iteratee chain to the Enumerator provided by Concurrent.broadcast. Filtering for the correct chat room is done with a filtering Enumeratee. 

![Architecture](./tutorial/sse-chat2.png)

The client is designed as a single page application using **[AngularJS](http://angularjs.org)**. The file organization is inspired by the **[angular-seed](https://github.com/angular/angular-seed)** project.

There are Romeo and Juliet hanging out in Room 1 in order to make looking at the app a little less boring. They are having their balcony scene conversation, but they are confused, uttering the lines at random.

How to run this: 

1) with Activator installed on your machine: **activator run** in the project folder
    
2) without Play installed you can make use of the Typesafe Activator feature: **./activator ui** in the project folder (or double click on activator script in OS X)

This application will work in Firefox, Safari, Chrome and Opera. It will not work in Internet Explorer, simply because Microsoft for whatever reason does not support Server Sent Events.

## Requirements
- Java 8 (Uses lambda expressions and Map.compute)

## Licence

This software is licensed under the Apache 2 license, quoted below.

Copyright &copy; 2013 **[Markus Jura]**.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
