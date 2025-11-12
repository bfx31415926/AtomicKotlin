package MemberReferences// MemberReferences/SortWith.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import memberreferences1.Message
import atomictest.eq

fun main() {
	val messages = listOf(
		Message("Kitty", "Hey!", true),
		Message("Kitty", "Where are you?", false),
		Message("Boss", "Meeting today", false)
	)
	messages.sortedWith(
		compareBy(
			Message::isRead, Message::sender
		)
	) eq
			listOf(
				// First unread, sorted by sender:
				Message("Boss", "Meeting today", false),
				Message(
					"Kitty",
					"Where are you?", false
				),
				// Then read, also sorted by sender:
				Message("Kitty", "Hey!", true)
			)
}
/*
[Message(sender=Boss, text=Meeting today, isRead=false), Message(sender=Kitty, text=Where are you?, isRead=false), Message(sender=Kitty, text=Hey!, isRead=true)]
 */