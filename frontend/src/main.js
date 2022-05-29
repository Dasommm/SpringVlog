import Vue from "vue";
import App from "./App.vue";
import http from "./http/customAxios";
import "bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
//import routes from "./router";
import VueRouter from "vue-router";
import BlogList from "./components/BlogList";
import HomePage from "./components/HomePage";
import ListDetail from "./components/ListDetail";
import WritePage from "./components/WritePage";

Vue.config.productionTip = false;
Vue.prototype.$http = http;

Vue.use(VueRouter);

const myrouter = new VueRouter({
  mode: "history",
  // routes: routes,
  routes: [
    { path: "/list", component: BlogList },
    { path: "/", component: HomePage },
    { path: "/detail/:number", component: ListDetail, props: true },
    { path: "/write/", component: WritePage },
  ],
});

new Vue({
  router: myrouter,
  render: (h) => h(App),
}).$mount("#app");
