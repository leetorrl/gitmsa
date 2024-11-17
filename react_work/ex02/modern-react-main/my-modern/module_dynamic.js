import('./App.js').then(app => {
  console.log(app.getTriangle(10, 5));  // 결과: 25

  const a = new app.Article();
  console.log(a.getAppTitle()); // 결과: React 앱
});