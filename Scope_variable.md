# Scope of Variables in Java

In Java, **variable scope** refers to the region or part of the program where a variable can be declared, accessed, and used.

---

## **Types of Variable Scope**

1. **Local Variables**
2. **Instance Variables (Non-Static Fields)**
3. **Static Variables (Class-Level Fields)**

---

### **1. Local Variables**
- Declared **inside a method**, constructor, or block.
- Accessible **only** within the block where they are declared.
- Created when the method/block is called and destroyed when it ends.
- **Not initialized** automatically; must be initialized before use.


### **2. Instance Variables**
- Declared **inside a class** but **outside methods**.
- Belong to an instance (object) of the class.
- Initialized to default values if not explicitly assigned:
    - 0 for numbers
    - false for boolean
    - null for objects
- Separate copies are created for each object.

### **3. Static Variables**
- Declared with the `static` keyword **inside a class** but **outside methods**.
- Belong to the class itself, not any specific object.
- Shared among all instances (objects) of the class.
- Initialized to default values if not explicitly assigned:
    - 0 for numbers
    - false for boolean
    - null for objects



