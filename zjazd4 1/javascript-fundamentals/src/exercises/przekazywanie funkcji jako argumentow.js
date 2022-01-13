const incr = function (val) {
    if (typeof val !== 'number') {
        return -1;
    }
    return val + 1;
};

const numbers = [0, 1, 2, 5, 10, 'a'];
// const betterNumbers = [];

// for (const number of numbers) {
//     const result = incr(number);
//     betterNumbers.push(result);
// }

const newNumbers = numbers.map(incr);
console.log(newNumbers); // wyjdzie [1, 2, 3, 6, 11, -1]

const isLowerThan = function (val) {
    if (typeof val !== 'number') {
        return false;
    }
    return val < 5;
};

console.log(isLowerThan(10)); // wyjdzie false
console.log(isLowerThan(4)); // wyjdzie true

const filteredNumbers = numbers.filter(isLowerThan);
console.log(filteredNumbers); // wyjdzie [0, 1, 2]
