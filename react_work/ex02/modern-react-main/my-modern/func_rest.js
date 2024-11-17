function sum(...nums) {
  let result = 0;
  for (const num of nums) {
    result += num;
  }
  return result;
}

console.log(sum(10, 25, 2));          // 결과: 37
console.log(sum(7, 13, 25, 6, 100));  // 결과: 151
// console.log(sum(...[10, 25, 2]));


