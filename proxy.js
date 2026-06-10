const product = {
  name: "Laptop",
  price: 1200
};

// Read operation
console.log("Reading price:");
console.log(Reflect.get(product, "price"));

// Write operation
console.log("Writing price:");
Reflect.set(product, "price", 1500);

// Read again
console.log("Updated price:");
console.log(Reflect.get(product, "price"));