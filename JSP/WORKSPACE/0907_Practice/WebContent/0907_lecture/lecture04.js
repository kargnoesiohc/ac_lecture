function one(x, y, z) {
  for (let i = 0; i < arguments.length; i++) {
    console.log(arguments.length);
  }
}

one(1, 2);
one(1, 2, 3);
one(1, 2, 3, 4);