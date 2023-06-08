# isbnJava

The isbnJava is a Java application that validates and converts International Standard Book Numbers (ISBN). 
It checks if an ISBN-10 or ISBN-13 is valid and provides the option to convert an ISBN-10 to ISBN-13.

## Prerequisites

To run this application, you need to have the following installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven

## Installation

Clone the repository to your local machine:

   
git clone https://github.com/enriched-h/HyperionDev_Hope/.git


Navigate to the project directory:
cd HyperionDev_Hope/Section\ C/isbn-validator

Build the application using Maven:
mvn clean install


## Usage
Run the application using the following command:
java -jar target/isbnJava.jar


Enter an ISBN (ISBN-10 or ISBN-13) and press Enter.

The application will validate the ISBN and provide the result:

If it's a valid ISBN-13, it will display "Valid."
If it's a valid ISBN-10, it will display the converted ISBN-13.
If it's an invalid ISBN, it will display "Invalid."


## Examples
ISBN-10: 0330301624
Output: ISBN-13: 9780330301626

ISBN-13: 9780316066525
Output: Valid

ISBN: 1234567890
Output: Invalid


## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.