const add = function (x, y) {
    return x + y;
};

// to samo mozna zapisac (zeby uproscic sobie pisanie)
const add2 = (x, y) => x + y;

// inny przyklad

const nums = [1, 2, 3, 4, 5];
const newNums = nums.map((value) => value + 1);
console.log(newNums); // pokaze[2, 3, 4, 5, 6]
