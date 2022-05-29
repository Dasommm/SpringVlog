<template>
  <div>
    <table class="table table-light table-hover">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">제목</th>
          <th scope="col">내용</th>
          <th scope="col">날짜</th>
          <th scope="col">바로가기</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="obj in blogListArr" :key="obj">
          <th scope="row">{{ obj.number }}</th>
          <td>{{ obj.title }}</td>
          <td>{{ obj.content }}</td>
          <td>{{ obj.date }}</td>
          <td><router-link :to="`/detail/${obj.number}`">바로가기</router-link></td>
        </tr>
      </tbody>
    </table>
    <router-link to="/write">
      <button type="button" class="btn btn-primary">글입력</button>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "blog-list",
  data() {
    return {
      blogListArr: [],
    };
  },
  mounted() {
    this.getBlogList();
  },
  methods: {
    getBlogList: async function () {
      await this.$http
        .post("/api/v1/getBlogList")
        .then((data) => {
          //데이터를 List에 꽂아주기
          // console.log("data:", data);
          this.blogListArr = data;
          // console.log("listArr : ", this.blogListArr);
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>

<style></style>
