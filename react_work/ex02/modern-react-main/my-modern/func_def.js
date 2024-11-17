function getTrapezoidArea(upper = 1, lower = 1, height = 1) {
  return (upper + lower) * height / 2;
}

console.log(getTrapezoidArea(10, 5, 3));  // 결과: 22.5 (=(10 ＋ 5) × 3 ÷ 2)
console.log(getTrapezoidArea(10, 5))      // 결과: 7.5  (=(10 ＋ 5) × 1 ÷ 2)
console.log(getTrapezoidArea(10));        // 결과: 5    (=(10 ＋ 1) × 1 ÷ 2)


// function getTrapezoidArea(upper = 1, lower = upper, height = upper) { ... }