# offersAPI
MicroService in Java

How to use this:

1.) Download this git repo

2.) Type " mvn package " after moving to the demoRestApi directory in the terminal

3.) Execute the Jar file in the target directory by typing 

"java -jar demoRestApi-0.0.1-SNAPSHOT.jar"

4.) Merchants can access the REST API by filling the paramters . The query template is :

http://localhost:8080/product/{product}/{productDescription}/{offer}/{productPrice}/{definedCurrency}

A specific example is http://localhost:8080/product/shoe/testDescription/5/100/USD

A JSON response for this query would be :

{
product: "shoe",
productDescription: "testDescription",
offerPercentage: 5,
productOriginalPrice: 100,
definedCurrency: "USD",
offerPrice: 95
}
