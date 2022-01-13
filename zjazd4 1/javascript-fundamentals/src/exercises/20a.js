function stringLen(napis) {
    if (typeof napis !== 'string') return -1;
    else return napis.length;
}

let result1 = stringLen('Hello');
console.log(result1);
