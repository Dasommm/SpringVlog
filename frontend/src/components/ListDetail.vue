<template>
  <div class="card" style="width: 18rem">
    <div class="card-body">
      <h5 class="card-title">{{ detail.title }}</h5>
      <h6 class="card-subtitle mb-2 text-muted">{{ detail.date }}</h6>
      <p class="card-text">{{ detail.content }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "list-detail",
  data() {
    return {
      detail: {},
    };
  },
  created() {
    const test = this.$route.params.number;
    console.log("test :", test);
    this.getDetail();
  },
  methods: {
    getDetail: async function () {
      const number = this.$route.params.number;

      await this.$http
        .get(`/api/v1/getDetail/${number}`)
        .then((res) => {
          console.log("detail data:", res);
          this.detail = res;
        })
        .catch((err) => console.log(err));
    },
  },
};
</script>

<style></style>
