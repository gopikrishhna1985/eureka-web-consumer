# eureka-web-consumer
A Simple Eureka Web Consumer for the micro-service created and registered in the Eureka Registry

@EnableEurekaClient - Enables this app to be a Eureka Client and registers automatically to the registry

@LoadBalanced - used to decide which service instance to use. Because multiple instances will be deployed and consumer needs to know which one to use

We will use RestTemplate for Service Discovery and Load Balancing on the client side, by creating an instance of it
