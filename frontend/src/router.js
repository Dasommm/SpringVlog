// import { createRouter, createWebHistory } from "vue-router";
import BlogList from "./components/BlogList.vue";

// const Foo = { template: "<div>Foo</div>" };

const routes = [
  {
    path: "/list",
    component: BlogList,
  },
];

// const router = createRouter({
//   history: createWebHistory(),
//   routes,
// });

export default routes;
