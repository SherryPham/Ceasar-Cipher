# The Caesar Cipher: A Classical Encryption Technique

## Overview

This repo implements a simple encryption and decryption mechanism using the Caesar Cipher algorithm in Java. The Caesar Cipher is a substitution cipher where each letter in the plaintext is shifted a fixed number of places in the alphabet.

The repo contains two files:

encryption.java (encryption) - Used to encrypt a plaintext string.
decryption.java (decryption) - Used to decrypt a ciphertext string.

<p align="center">
  <img src="/CeasarCipher.jpeg" alt="Ceasar Cipher figure">
</p>

## Abstract

The Caesar Cipher is one of the simplest and oldest known encryption methods, representing a fundamental concept in cryptography. This paper explores the historical context, mechanism, and cryptographic significance of this ancient substitution cipher.

## 1. Introduction

Named after Julius Caesar, who reportedly used it to communicate with his generals, the Caesar Cipher is a basic encryption technique where letters in a message are shifted by a fixed number of positions in the alphabet. Despite its simplicity, it provides insight into the foundational principles of cryptographic transformation.

## 2. Cryptographic Mechanism

### 2.1 Basic Operation

The cipher operates through a straightforward letter substitution process:

- Each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet
- The shift value determines the specific substitution pattern
- After reaching the end of the alphabet, the substitution wraps around to the beginning

### 2.2 Mathematical Representation

Let k represent the shift value:

- Encryption: E(x) = (x + k) mod 26
- Decryption: D(x) = (x - k) mod 26
  Where x represents the numeric position of a letter in the alphabet (0-25)

## 3. Example Implementation

### 3.1 Encryption Process

Consider a shift of 3:

- A → D
- B → E
- C → F
- ... and so on

Example:

- Plaintext: "HELLO"
- Shift: 3
- Ciphertext: "KHOOR"

## 4. Cryptanalysis and Vulnerabilities

### 4.1 Limitations

- Only 26 possible keys (in English alphabet)
- Highly susceptible to frequency analysis
- No security against modern computational techniques

### 4.2 Brute Force Vulnerability

- An attacker can easily try all 26 possible shifts
- Computational complexity: O(1)

## 5. Historical Significance

- Used by Julius Caesar in military communications
- Represents one of humanity's earliest systematic encryption methods
- Serves as a fundamental educational tool in cryptography

## 6. Conclusion

While the Caesar Cipher is cryptographically weak by modern standards, it remains an important historical milestone in the development of encryption techniques. It demonstrates core principles of substitution-based encryption and serves as a foundational concept in understanding more complex cryptographic systems.

## References

1. Singh, S. (1999). The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography
2. Kahn, D. (1996). The Codebreakers: The Comprehensive History of Secret Communication from Ancient Times to the Internet
