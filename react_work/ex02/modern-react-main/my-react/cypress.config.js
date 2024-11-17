const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    // 기본 경로 정의
    baseUrl: 'http://localhost:3000',
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
