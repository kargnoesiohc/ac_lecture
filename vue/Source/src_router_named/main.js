import Vue from 'vue'
import App from './App.vue'
import router from './router.js'; //라우터 임포트
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
