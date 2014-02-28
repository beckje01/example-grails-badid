package badidtest

class PersonController {

	def index() {
		render "INDEX"
	}

	def show(Person p) {
		render p?.name
	}
}
