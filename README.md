# Run Length Encoding

A simple implementation of the Run Length Encoding (RLE) algorithm in Java. 
This project encodes strings by compressing consecutive occurrences of characters.
Built using Java 25 and Maven

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Testing](#testing)
- [Usage](#usage)

## Features

- Compression: Efficient compression of strings with repeated characters.
- Handles various input cases, including empty strings and single characters.
- Modern Java: Utilizes the latest features available in JDK 25.
- Automated Testing: Includes a full suite of JUnit 5 test cases.

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/dianatuffreau/rle.git

2. **Build the project:**
   ```bash
   mvn clean install


## Testing
I have included a comprehensive test suite to ensure the algorithm handles standard strings, single characters, and empty inputs correctly.
mvn test


## Usage
To run the main application:
mvn exec:java -Dexec.mainClass="com.dianatuffreau.RunLengthEncoder"