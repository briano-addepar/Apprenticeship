# Litzy Yang's Application for Software Engineering Apprenticeship (2022) at Lyft

To run the following code, you will need Java 8 and sbt.

#### Note: 
I will prepare myself to be very comfortable with Python and Javacript prior to the start of the Apprenticeship if Lyft's stacks are in Python and Javascript. I am most comfortable writing Java application and Play framework so this why I am using Java for this application.

## This application:

* Accepts a `POST` request to the route `/test`, which accepts one argument `string_to_cut`

* Return a JSON object with the key `return_string` and a string containing every third character from the original string

```bash
# Example 1: 
curl -X POST http://localhost:9000/test --data '{"string_to_cut": "jangodoggoischonk"}' -H 'Content-Type: application/json'
{"return_string":"ndgso"}
# Example 2: 
curl -X POST http://localhost:9000/test --data '{"string_to_cut": "meeko pupper"}' -H 'Content-Type: application/json'
{"return_string":"e pr"}
```
### Before running the `curl` command:
* execute `sbt run` on terminal at the project root
* the application will serve at port `9000` at local host

### Testing the `/test`:
There are two test classes under `test` folder named;
* `test/controllers/HomeControllerTest.java`
* `test/core/StringCutterTest.java`