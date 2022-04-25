import { defineStore } from 'pinia'

export const tokenStore = defineStore({
  id: 'token',
  state: () => ({
    token: ''
  }),
  getters: {
    getToken: (state) => state.token
  },
  actions: {
    set (token: string) {
      this.token = token
    }
  }
})
