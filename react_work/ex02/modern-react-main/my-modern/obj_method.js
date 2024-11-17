const member = {
  name: '사토 리오',
  greet: function() {
    console.log(`안녕하세요, ${this.name} 님！`);
  }
}

// const member = {
//   name: '사토 리오',
//   greet() {
//     console.log(`안녕하세요, ${this.name} 님！`);
//   }
// }

member.greet();